import javax.swing.JButton;

public class App {
	
	public static String DIRETORIO= App.class.getResource(".").getPath();
	
	public static void main(String[] args) {
		Janela janela=new Janela();
				
    	JButton right=new JButton("right");
    	janela.setButton(right);
    	
    	JButton left=new JButton("left");
    	janela.setButton(left);
    	
    	JButton up=new JButton("up");
    	janela.setButton(up);
    	
    	JButton down=new JButton("down");
    	janela.setButton(down);
    	
    	JButton random=new JButton("random");
    	janela.setButton(random);
    	
		ImagemAnimada lula= new ImagemAnimada(DIRETORIO+"lula.png");//adiciona a imagem animada no in�cio
		janela.setImage(lula);
		
		lula.vinculateButtons(up, right, left, down, random);
		
		right.addActionListener(lula);
		left.addActionListener(lula);
		up.addActionListener(lula);
		down.addActionListener(lula);
		random.addActionListener(lula);
		
		janela.setAmbiente(DIRETORIO+"dino.png");//cria o ambiente inicial
    	
	}

}
