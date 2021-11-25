# hospital

Projeto em Clojure criado para acompanhar a aula da Alura
- Clojure: Mutabilidade com átomos e refs
- https://cursos.alura.com.br/course/clojure-mutabilidade-com-atoms-e-refs

### Aula 01
Nessa aula, aprendemos:

- Criar filas vazias
- Adicionar elementos em uma fila utilizando conj
- Remover o primeiro elemento da fila utilizando pop
- Selecionar o primeiro elemento da fila utilizando peek
- Atualizar o valor do mapa utilizando update


### Aula 02

Nessa aula, aprendemos:

- Implementar um limite à fila fazendo uso do if
- Verificar o tamanho da fila utilizando count
- Tratar erros não previstos com a função ex-info
- Trabalhar com a compatibilidade Java ao criar a classe Thread
- Iniciar uma Thread com o método start
- Compreender os problemas que existem ao utilizarmos símbolos globais compartilhados entre threads

### Aula 03

Nessa aula, aprendemos:

- Implementar um limite à fila fazendo uso do if
- Evitar o uso de símbolos globais Root Binding
- Transformar um mapa imutável em mutável através do uso do atom
- Dereferenciar o átomo com deref para acessar a fila de espera dentro de um mapa
- Usar Shadowing para “esconder” um símbolo local
- Alterar o conteúdo de dentro do átomo usando swap!
- Usar o swap para evitar o problema de concorrência


### Aula 04 

Nessa aula, aprendemos:

- Utilizar mapv para forçar a execução de uma função
- Aumentar a legibilidade do código extraindo responsabilidades das funções
- Implementar uma chamada parcial de uma função utilizando partial
- Utilizar doseq para iterar por uma sequência de elementos
- Utilizar dotimes para executar uma tarefa um número fixo de vezes


## Aula 05
Nessa aula, aprendemos:

- Fazer a transferência de uma pessoa de uma fila para outra
- Criar Delegates
- Isolar a mutabilidade da imutabilidade
- Utilizar juxt para invocar várias funções em um parâmetro