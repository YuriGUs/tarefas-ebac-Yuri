package CadastroClienteSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    private JTable tabelaClientes;
    private JTextField txtNome;
    private JTextField txtCPF;

    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    private void initComponents() {
        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);

        JLabel lblCPF = new JLabel("CPF:");
        txtCPF = new JTextField(15);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSalvarActionPerformed(e);
            }
        });

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnExcluirActionPerformed(e);
            }
        });

        tabelaClientes = new JTable();
        JScrollPane jScrollPane1 = new JScrollPane(tabelaClientes);

        // Layout
        JPanel panel = new JPanel();
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblCPF);
        panel.add(txtCPF);
        panel.add(btnSalvar);
        panel.add(btnExcluir);

        add(panel);
        add(jScrollPane1);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setTitle("Cadastro de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        tabelaClientes.setModel(modelo);
    }

    private void btnSalvarActionPerformed(ActionEvent evt) {
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();

        if (nome.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        modelo.addRow(new Object[]{nome, cpf});
        limparCampos();
    }

    private void btnExcluirActionPerformed(ActionEvent evt) {
        int linhaSelecionada = tabelaClientes.getSelectedRow();

        if (linhaSelecionada >= 0) {
            modelo.removeRow(linhaSelecionada);
            JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso.");
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum cliente selecionado.");
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCPF.setText("");
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
