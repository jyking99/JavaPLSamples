package ch06.e4_signal;

enum Signal {
	/** ���K���6.5
	 * �萔�ŗL���\�b�h��Color�I�u�W�F�N�g��Ԃ�
	 * ���_�F�萔�ŗL�ɂ���K�v�͂Ȃ��B
	 */
	RED(new Color("red")),
	YELLOW(new Color("yellow")),
	BLUE(new Color("blue"));
	
	Color color;
	
	Signal(Color color) {
		this.color = color;
	}
	
	Color getColor() {
		return color;
	}
	
	// Is it good to define a main method in a enum class?
	public static void main(String[] args) {
		System.out.println(RED.getColor());
		System.out.println(YELLOW.getColor());
		System.out.println(BLUE.getColor());
	}
}
