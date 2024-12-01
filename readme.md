# Projeto Números Primos em Java

Este projeto em Java implementa um sistema para verificar se um número é primo e gerar o próximo número primo a partir de um valor dado. O projeto utiliza os conceitos de herança e polimorfismo, onde as classes especializadas estendem as funcionalidades de uma classe base para gerar e verificar números primos.

---

## Funcionalidades Principais

1. **Classe `NumerosPrimos`:**
    - Representa um número e contém métodos para verificar sua primalidade e gerar o próximo número primo.
    - Método `verificarPrimalidade()` verifica se o número é primo.
    - Método `listarPrimos()` encontra o próximo número primo após o valor fornecido.

2. **Classe `VerificadorPrimo` (Herança):**
    - Estende a classe `NumerosPrimos` e implementa o método `verificarSeEhPrimo()` para exibir se o número é primo ou não.
    - Sobrescreve o método de verificação de primalidade para apresentar uma mensagem ao usuário.

3. **Classe `GeradorPrimo` (Herança):**
    - Estende a classe `NumerosPrimos` e implementa o método `gerarProximoPrimo()` para exibir o próximo número primo após o valor fornecido.

4. **Classe `App`:**
    - A classe principal que interage com o usuário, solicita a entrada de um número e utiliza as classes `VerificadorPrimo` e `GeradorPrimo` para realizar as operações.

---

## Estrutura de Pacotes

O projeto foi organizado em pacotes para refletir boas práticas de estruturação, separando as responsabilidades das classes de forma modular. A estrutura é a seguinte:

```plaintext
primos/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── matematica/
│   │   │   │   ├── primos/
│   │   │   │   │   ├── application/      # Contém a classe principal para execução
│   │   │   │   │   │   ├── App.java
│   │   │   │   │   ├── model/            # Contém as classes de entidades como NumerosPrimos
│   │   │   │   │   │   ├── NumerosPrimos.java
│   │   │   │   │   ├── service/           # Contém as classes de serviço como VerificadorPrimo e GeradorPrimo
│   │   │   │   │   │   ├── VerificadorPrimo.java
│   │   │   │   │   │   ├── GeradorPrimo.java
```
## Detalhes dos Pacotes

### application
Contém a classe `App.java`, responsável por interagir com o usuário e executar os exemplos de uso do sistema.

### model
Contém a classe `NumerosPrimos`, que define as operações principais relacionadas a números primos, como a verificação de primalidade e a geração do próximo primo.

### service
Contém as classes de serviços que estendem ou adicionam funcionalidades específicas:

- **`VerificadorPrimo.java`**: Estende a classe `NumerosPrimos` e implementa a lógica para verificar se o número é primo.
- **`GeradorPrimo.java`**: Estende a classe `NumerosPrimos` e implementa a lógica para gerar o próximo número primo.

## Exemplos de Uso

### Verificar se um número é primo:
```java
VerificadorPrimo verificarPrimo = new VerificadorPrimo(29);
verificarPrimo.verificarSeEhPrimo();  // Saída: O número 29 é primo.
```
### Gerar o próximo número primo após um número dado:
```java
GeradorPrimo geradorPrimo = new GeradorPrimo(29);
geradorPrimo.gerarProximoPrimo();  // Saída: O próximo número primo é 31.
```
## Como Executar o Projeto

1. Clone este repositório em sua máquina.
2. Configure o ambiente Java (versão 8 ou superior).
3. Navegue até a classe principal `App.java` e execute o programa para interagir com o console.

---

### **Autor: Lucas Degrande**

Este projeto foi desenvolvido para demonstrar o uso de herança e polimorfismo em Java, com foco na verificação e geração de números primos.


