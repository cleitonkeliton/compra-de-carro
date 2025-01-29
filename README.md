# Compra de Carros
Este projeto simula a compra de carros, verificando se o ano de fabricação é válido e mostrando informações sobre os veículos. Ele também permite a criação de carros elétricos, com informações sobre a bateria, e valida se o carro pode ser adquirido com base no seu ano de fabricação.

## Funcionalidades
- Cadastro de carros com marca, modelo e ano de fabricação.
- Validação para garantir que carros com ano inferior a 2000 não possam ser comprados.
- Exibição das informações do carro.
- Suporte para carros elétricos, mostrando o status da bateria.
- Ordenação dos carros por ano de fabricação.

## Metodologias Usadas

### Programação Orientada a Objetos (POO)
O projeto foi desenvolvido com base nos conceitos de Programação Orientada a Objetos. Usamos classes e objetos para modelar as funcionalidades do sistema. As classes `Carro` e `Eletrico` seguem os princípios de POO, com:

- **Encapsulamento**: Os dados são protegidos e acessados de forma controlada.
- **Herança**: A classe `Eletrico` herda os atributos e métodos de `Carro`, mas também adiciona suas próprias funcionalidades.
- **Abstração**: As funcionalidades do carro e do carro elétrico são ocultadas em métodos, deixando o código mais simples de entender.
- **Polimorfismo**: A classe `Eletrico` sobrescreve o método `exibirInfo` para mostrar informações adicionais sobre a bateria.

### Tratamento de Exceções
Foi implementado um tratamento de exceções para garantir que carros com ano inferior a 2000 não possam ser comprados. Quando isso acontece, é lançada uma exceção personalizada, avisando o usuário sobre a limitação.

### Programação Defensiva
A programação foi feita de forma a garantir que o sistema só aceite dados válidos. Ao lançar a exceção para carros com ano inferior a 2000, evitamos que o sistema aceite entradas que possam causar problemas no futuro.

### Desenvolvimento Incremental
O projeto foi desenvolvido de maneira gradual, com funcionalidades sendo implementadas e testadas aos poucos. Isso ajudou a garantir que o sistema estivesse funcionando corretamente à medida que novas partes eram adicionadas.

### Organização do Código
A estrutura do código foi pensada para ser simples e modular. As responsabilidades foram separadas entre as classes, o que facilita a manutenção e a reutilização de código.

