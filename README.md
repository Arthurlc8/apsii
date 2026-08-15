classDiagram
    class AgendaDeAniversarios {
        <<interface>>
        +adicionarAniversariante(nome: String, dia: int, mes: int) void
        +obterAniversariantesDoDia(dia: int, mes: int) ArrayList~String~
        +removerAniversariante(nome: String) void
    }

    class MinhaAgendaDeAniversarios {
        -lista: ArrayList~Aniversariante~
        +adicionarAniversariante(nome: String, dia: int, mes: int) void
        +obterAniversariantesDoDia(dia: int, mes: int) ArrayList~String~
        +removerAniversariante(nome: String) void
    }

    class Aniversariante {
        -nome: String
        -dataAniversario: DataAniversario
        +Aniversariante(nome: String, dia: int, mes: int)
        +Aniversariante(nome: String, data: DataAniversario)
        +equals(obj: Object) boolean
        +getNome() String
        +getDataAniversario() DataAniversario
    }

    class DataAniversario {
        -dia: int
        -mes: int
        +DataAniversario(dia: int, mes: int)
        +equals(obj: Object) boolean
    }

    class Main {
        +main(args: String[]) void
    }

    AgendaDeAniversarios <|.. MinhaAgendaDeAniversarios : implements
    MinhaAgendaDeAniversarios *-- Aniversariante : contem
    Aniversariante *-- DataAniversario : possui
    Main ..> MinhaAgendaDeAniversarios : usa
