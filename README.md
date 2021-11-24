# hospital

A Clojure library designed to ... well, that part is up to you.

## Usage

FIXME

## License

Copyright © 2021 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.

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