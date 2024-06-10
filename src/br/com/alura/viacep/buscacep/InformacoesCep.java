package br.com.alura.viacep.buscacep;

import com.google.gson.annotations.SerializedName;

public class InformacoesCep {

		@SerializedName("cep")
		private String cep;
		@SerializedName("logradouro")
		private String logradouro;
		@SerializedName("complemento")
		private String complemento;
		@SerializedName("bairro")
		private String bairro;
		@SerializedName("localidade")
		private String cidade;
		@SerializedName("uf")
		private String estado;
		
		public InformacoesCep(InformacoesViaCep informacoesViaCep) {
			this.cep = informacoesViaCep.cep();
			this.logradouro = informacoesViaCep.logradouro();
			this.bairro = informacoesViaCep.bairro();
			this.cidade = informacoesViaCep.localidade();
			this.estado = informacoesViaCep.uf();
		}
		
	
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		
		public String getLogradouro() {
			return logradouro;
		}
		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
		
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}

	    @Override
	    public String toString() {
	        return "Cep: " + cep + "\n" +
	                "Logradouro: " + logradouro + "\n" +
	                "bairro: " + bairro  + "\n" +
	                "Cidade: " + cidade +  "\n" +
	                "Uf: " + estado;
	    }
		
}
