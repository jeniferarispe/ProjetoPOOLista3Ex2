package model;

public class Notas {

	private float nota1;
	private float nota2;
	private float nota3;
	private float media;

	public Notas() {

	}

	public Notas(float nota1, float nota2, float nota3, float media) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = media;

	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public float calcularMedia() {

		return this.media = (nota1 + nota2 + nota3) / 3f;

	}

	public boolean verificarSituacao() {
		this.calcularMedia();
		if (this.media >= 6) {
			return true;
		} else {
			return false;

		}
	}

}
