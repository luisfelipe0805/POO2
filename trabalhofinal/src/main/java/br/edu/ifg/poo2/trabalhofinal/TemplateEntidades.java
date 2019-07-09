package br.edu.ifg.poo2.trabalhofinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifg.poo2.trabalhofinal.factory.ClienteFactory;
import br.edu.ifg.poo2.trabalhofinal.factory.FornecedorFactory;
import br.edu.ifg.poo2.trabalhofinal.factory.ProdutoFactory;
import br.edu.ifg.poo2.trabalhofinal.repository.ClienteRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.FornecedorRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.ProdutoRepository;

@Service
public class TemplateEntidades {
	
	@Autowired
	ClienteRepository clienteDao;
	
	@Autowired
	FornecedorRepository fornecedorDao;
	
	@Autowired
	ProdutoRepository produtoDao;
	
	public  TemplateEntidades() {
		ClienteFactory clienteFactory = new ClienteFactory();
		FornecedorFactory fornecedorFactory = new FornecedorFactory();
		ProdutoFactory  produtoFactory = new ProdutoFactory();
		criarTemplate(clienteFactory, fornecedorFactory, produtoFactory);	
	}
	//nao ta criando o templates... da null pointer
	private void criarTemplate(ClienteFactory clienteFactory,FornecedorFactory fornecedorFactory,ProdutoFactory produtoFactory) {
//		clienteDao.save(clienteFactory.getCliente());
//		fornecedorDao.save(fornecedorFactory.getFornecedor());
//		produtoDao.save(produtoFactory.getProduto());
	}
}
