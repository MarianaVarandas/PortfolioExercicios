-- Implemente uma consulta para listar a descrição, a data e o custo de todas as manutenções realizadas nos veículos.

select descricao, dataManutencao, custo from manutencao;
     
-- Implemente uma consulta para listar o valor total arrecadado pela locadora. Lembre-se que pagamentos “pendentes” não fazem parte da soma.

select sum(valorTotal) from pagamento
	where estado = 'Pago';

-- Implemente uma consulta para listar o modelo e a marca dos veículos, bem como o número de vezes que cada um foi locado. A listagem deve ser mostrada em ordem decrescente pelo número de aluguéis.

select modelo, marca,
count(locacaoVeiculo.idVeiculo) as numeroLocacoes
from veiculo 
inner join locacaoVeiculo
on veiculo.idVeiculo = locacaoVeiculo.idveiculo 
group by veiculo.modelo, veiculo.marca
order by numeroLocacoes desc;

-- Implemente uma consulta para listar o nome dos clientes que possuem pagamento “pendente”, bem como o valor devido por eles. A listagem deve ser mostrada em ordem alfabética crescente pelo nome dos clientes.

select nome,
sum(pagamento.ValorTotal) as debito
from cliente 
inner join locacao 
on cliente.idCliente = locacao.idCliente
inner join pagamento 
on locacao.idPagamento = pagamento.idPagamento
where  estado = 'Pendente'
group by cliente.nome
order by cliente.nome ASC
