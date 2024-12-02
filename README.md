![repo-sinc-threads-java](https://github.com/user-attachments/assets/e074d3e4-46ba-4242-aa76-4ae486ce8c97)

<h1>Exemplo de sincronização de threads em Java</h1>

<p align="justify">Este repositório contém um exemplo de como a sincronização pode solucionar problemas de concorrência (quando duas ou mais threads tentam acessar o mesmo recurso ao mesmo tempo).<br/>
Visando garantir a consistência dos dados, somente uma thread deve acessar um dado que esteja na região crítica por meio da estratégia de exclusão mútua.<br/>
A situação apresentada nesse repositório simula um sistema de e-commerce no qual consta um estoque de 3 unidades de um determinado produto.<br/>
Nesse sistema, 10 clientes solicitam compra desse produto, e todos os pedidos são faturados, gerando um grande problema para a loja, cujo estoque é insuficiente para atender a essa demanda.</p>

<h2>Problema:</h2>
<p align="justify">Como o conceito de exclusão mútua não é aplicado no código, todas as threads acessam a região crítica do código ao mesmo tempo. Em outras palavras, todas as threads testam o if (linha 12) ao mesmo tempo, entendendo que o estoque ainda é positivo. Isso faz com que todos os pedidos sejam efetuados erroneamente pelo sistema.</p>

<h2>Solução:</h2>
<p align="justify">Nesse cenário, a implementação do método synchronized() garante que as threads atuem de forma sincronizada, garantindo que apenas uma thread acesse a região crítica do código por vez.<br/>
Para que isso ocorra, basta comentar o método run() (linha 10), para que o método synchronized() passe a atuar no código.</p><br/>
