package ar.edu.unju.edm.modelo;

public class Reserva {

		private long idreserva;
		private String tiporeserva;
		private String desayunos;
		
		public Reserva () {
		}

		public Reserva(long idreserva, String tiporeserva, String desayunos) {
			super();
			this.idreserva = idreserva;
			this.tiporeserva = tiporeserva;
			this.desayunos = desayunos;
		}

		public long getIdreserva() {
			return idreserva;
		}

		public void setIdreserva(long idreserva) {
			this.idreserva = idreserva;
		}

		public String getTiporeserva() {
			return tiporeserva;
		}

		public void setTiporeserva(String tiporeserva) {
			this.tiporeserva = tiporeserva;
		}

		public String getDesayunos() {
			return desayunos;
		}

		public void setDesayunos(String desayunos) {
			this.desayunos = desayunos;
		}
		
}
