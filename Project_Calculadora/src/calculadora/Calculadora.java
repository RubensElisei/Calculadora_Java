package calculadora;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

    private JFrame frame;
    private JTextField display;
    private double numeroAnterior;
    private String operacaoPendente;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculadora window = new Calculadora();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Calculadora() {
        initialize();
    }

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculadora");
		frame.setResizable(false);
		frame.setBounds(100, 100, 307, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setText("0");
		display.setFont(new Font("Tahoma", Font.PLAIN, 40));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(10, 11, 271, 90);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton btn_ac = new JButton("AC");
		btn_ac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
                numeroAnterior = 0;
                operacaoPendente = null;
            }
        });
		btn_ac.setBounds(8, 112, 62, 42);
		frame.getContentPane().add(btn_ac);
		
		
		JButton btn_porcentagem = new JButton("%");
		 btn_porcentagem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                double numeroAtual = Double.parseDouble(display.getText());
	                numeroAtual = numeroAtual / 100;
	                display.setText(String.valueOf(numeroAtual));
	            }
	        });
		btn_porcentagem.setBounds(78, 112, 62, 42);
		frame.getContentPane().add(btn_porcentagem);
		
		
		JButton btn_divisao = new JButton(" /");
		btn_divisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numeroAnterior = Double.parseDouble(display.getText());
                operacaoPendente = "/";
                display.setText("");
            }
        });
		btn_divisao.setBounds(148, 112, 62, 42);
		frame.getContentPane().add(btn_divisao);
		
		JButton btn_multiplicacao = new JButton("X");
		btn_multiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numeroAnterior = Double.parseDouble(display.getText());
                operacaoPendente = "X";
                display.setText("");
            }
        });
		btn_multiplicacao.setBounds(218, 112, 62, 42);
		frame.getContentPane().add(btn_multiplicacao);
		
		JButton btn_sete = new JButton("7");
		btn_sete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("7");
            }
        });
		btn_sete.setBounds(8, 165, 62, 42);
		frame.getContentPane().add(btn_sete);
		
		JButton btn_oito = new JButton("8");
		btn_oito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("8");
            }
        });
		btn_oito.setBounds(78, 165, 62, 42);
		frame.getContentPane().add(btn_oito);
		
		JButton btn_nove = new JButton("9");
		btn_nove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("9");
            }
        });
		btn_nove.setBounds(148, 165, 62, 42);
		frame.getContentPane().add(btn_nove);
		
		JButton btn_menos = new JButton("-");
		btn_menos.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        numeroAnterior = Double.parseDouble(display.getText());
		        operacaoPendente = "-";
		        display.setText("");
		    }
		});
		btn_menos.setBounds(218, 165, 62, 42);
		frame.getContentPane().add(btn_menos);
		
		JButton btn_um = new JButton("1");
		btn_um.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("1");
            }
        });
		btn_um.setBounds(8, 271, 62, 42);
		frame.getContentPane().add(btn_um);
		
		JButton btn_quatro = new JButton("4");
		btn_quatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("4");
            }
        });
		btn_quatro.setBounds(8, 218, 62, 42);
		frame.getContentPane().add(btn_quatro);
		
		JButton btn_dois = new JButton("2");
		btn_dois.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("2");
            }
        });
		btn_dois.setBounds(78, 271, 62, 42);
		frame.getContentPane().add(btn_dois);
		
		JButton btn_cinco = new JButton("5");
		btn_cinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("5");
            }
        });
		btn_cinco.setBounds(78, 218, 62, 42);
		frame.getContentPane().add(btn_cinco);
		
		JButton btn_tres = new JButton("3");
		btn_tres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("3");
            }
        });
		btn_tres.setBounds(148, 271, 62, 42);
		frame.getContentPane().add(btn_tres);
		
		JButton btn_seis = new JButton("6");
		btn_seis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("6");
            }
        });
		btn_seis.setBounds(148, 218, 62, 42);
		frame.getContentPane().add(btn_seis);
		
		JButton btn_mais = new JButton("+");
		btn_mais.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        numeroAnterior = Double.parseDouble(display.getText());
		        operacaoPendente = "+";
		        display.setText("");
		    }
		});
		btn_mais.setBounds(218, 218, 62, 42);
		frame.getContentPane().add(btn_mais);
		
		JButton btn_zero = new JButton("0");
		btn_zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarDisplay("0");
            }
        });
		btn_zero.setBounds(8, 324, 132, 42);
		frame.getContentPane().add(btn_zero);
		
		JButton btn_ponto = new JButton(".");
		btn_ponto.setBounds(148, 324, 62, 42);
		frame.getContentPane().add(btn_ponto);
		
		JButton btn_igual = new JButton("=");
		btn_igual.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        double numeroAtual = Double.parseDouble(display.getText());
		        double resultado = 0;
		        switch (operacaoPendente) {
		            case "+":
		                resultado = numeroAnterior + numeroAtual;
		                break;
		            case "-":
		                resultado = numeroAnterior - numeroAtual;
		                break;
		            case "X":
		                resultado = numeroAnterior * numeroAtual;
		                break;
		            case "/":
		                if (numeroAtual != 0) {
		                    resultado = numeroAnterior / numeroAtual;
		                } else {
		                    display.setText("Erro: Divisão por zero");
		                    return;
		                }
		                break;
		        }
		        display.setText(String.valueOf(resultado));
		    }
		});
		btn_igual.setBounds(218, 271, 62, 95);
		frame.getContentPane().add(btn_igual);
	}
	 private void atualizarDisplay(String valor) {
	        if (display.getText().equals("0")) {
	            display.setText(valor);
	        } else {
	            display.setText(display.getText() + valor);
	        }
	    }
	}

