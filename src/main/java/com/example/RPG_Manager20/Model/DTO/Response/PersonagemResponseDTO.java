package com.example.RPG_Manager20.Model.DTO.Response;

import com.example.RPG_Manager20.Model.Enums.Atributos;
import com.example.RPG_Manager20.Model.Enums.Classes;
import com.example.RPG_Manager20.Model.Enums.TipoConjuracao;
import com.example.RPG_Manager20.Model.Entities.Personagem;
import com.example.RPG_Manager20.Model.Entities.Classe;

public record PersonagemResponseDTO(
        Long id,
        String nomePersonagem,
        int nivelPersonagem,
        ClasseInfo classe,
        AtributosInfo atributos,
        MagiaInfo magia
) {

    public record ClasseInfo(
            Classes nome,
            int dadoDeVida,
            boolean isConjurador,
            Atributos atributoConjuracao,
            TipoConjuracao tipo
    ) {}

    public record AtributosInfo(
            int forca,
            int destreza,
            int constituicao,
            int inteligencia,
            int sabedoria,
            int carisma
    ) {
        public int getBonusForca() { return (forca - 10) / 2; }
        public int getBonusDestreza() { return (destreza - 10) / 2; }
        public int getBonusConstituicao() { return (constituicao - 10) / 2; }
        public int getBonusInteligencia() { return (inteligencia - 10) / 2; }
        public int getBonusSabedoria() { return (sabedoria - 10) / 2; }
        public int getBonusCarisma() { return (carisma - 10) / 2; }
    }

    public record MagiaInfo(
            int bonusProficiencia,
            int cd,
            int ataque
    ) {}

    public static PersonagemResponseDTO from(Personagem personagem, Classe classe) {
        int nivel = personagem.getNivelPersonagem();
        int bonusProficiencia = ((nivel + 3) / 4) + 1;

        int cd = 0;
        int ataque = 0;

        if (classe.isConjurador() && classe.getAtributoConjuracao() != null) {
            int valorAtributo = switch (classe.getAtributoConjuracao()) {
                case FORCA -> personagem.getValorForca();
                case DESTREZA -> personagem.getValorDestreza();
                case CONSTITUICAO -> personagem.getValorConstituicao();
                case INTELIGENCIA -> personagem.getValorInteligencia();
                case SABEDORIA -> personagem.getValorSabedoria();
                case CARISMA -> personagem.getValorCarisma();
            };
            int modificadorConjuracao = (valorAtributo - 10) / 2;

            cd = 8 + bonusProficiencia + modificadorConjuracao;
            ataque = bonusProficiencia + modificadorConjuracao;
        }

        return new PersonagemResponseDTO(
                personagem.getId(),
                personagem.getNomePersonagem(),
                personagem.getNivelPersonagem(),
                new ClasseInfo(
                        classe.getNomeClasse(),
                        classe.getDadoDeVida(),
                        classe.isConjurador(),
                        classe.getAtributoConjuracao(),
                        classe.getTipoConjuracao()
                ),
                new AtributosInfo(
                        personagem.getValorForca(),
                        personagem.getValorDestreza(),
                        personagem.getValorConstituicao(),
                        personagem.getValorInteligencia(),
                        personagem.getValorSabedoria(),
                        personagem.getValorCarisma()
                ),
                new MagiaInfo(bonusProficiencia, cd, ataque)
        );
    }
}