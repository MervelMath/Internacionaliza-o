/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifsc.internacionalizacao;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.json.JSONObject;

/**
 *
 * @author Aluno
 */
public class PaginaCadastroPerfil extends javax.swing.JFrame {

    /**
     * Creates new form PaginaCadastroPerfil
     */
    
    ResourceBundle traducoesRecebidas;
    PaginaPrincipal paginaPrincipal;
    
    public PaginaCadastroPerfil(ResourceBundle traducoes, PaginaPrincipal paginaPrincipal){
        initComponents();
        traducoesRecebidas = traducoes;
        this.paginaPrincipal = paginaPrincipal;
        AlterarLinguagemInformacoes();
    }
    
    public PaginaCadastroPerfil() {
        initComponents();
    }
    
    private void AlterarLinguagemInformacoes() {
        label_pesquisa.setText(traducoesRecebidas.getString("usuario_campo_pesquisa"));
        btn_pesquisar.setText(traducoesRecebidas.getString("usuario_btn_pesquisa"));
        label_nome_usuario.setText(traducoesRecebidas.getString("usuario_nome_usuario"));
        label_nome.setText(traducoesRecebidas.getString("usuario_nome"));
        label_email.setText(traducoesRecebidas.getString("usuario_email"));
        label_data_criacao.setText(traducoesRecebidas.getString("usuario_data_criacao"));
        label_comapania.setText(traducoesRecebidas.getString("usuario_compania"));
        label_seguidores.setText(traducoesRecebidas.getString("usuario_seguidores"));
        label_repos_publicos.setText(traducoesRecebidas.getString("usuario_repos_publicos"));
        label_biografia.setText(traducoesRecebidas.getString("usuario_biografia"));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        text_nome = new javax.swing.JTextField();
        text_email = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        label_data_criacao = new javax.swing.JLabel();
        text_data_criacao = new javax.swing.JTextField();
        text_biografia = new javax.swing.JTextField();
        label_biografia = new javax.swing.JLabel();
        label_comapania = new javax.swing.JLabel();
        text_compania = new javax.swing.JTextField();
        text_seguidores = new javax.swing.JTextField();
        label_seguidores = new javax.swing.JLabel();
        label_imagem = new javax.swing.JLabel();
        label_nome_usuario = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        label_repos_publicos = new javax.swing.JLabel();
        text_repos_publicos = new javax.swing.JTextField();
        label_pesquisa = new javax.swing.JLabel();
        text_pesquisa = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_nome.setText("Nome:");

        text_nome.setEditable(false);

        text_email.setEditable(false);

        label_email.setText("Email:");

        label_data_criacao.setText("Data de Criação: ");

        text_data_criacao.setEditable(false);

        text_biografia.setEditable(false);

        label_biografia.setText("Biografia:");

        label_comapania.setText("Compania:");

        text_compania.setEditable(false);

        text_seguidores.setEditable(false);

        label_seguidores.setText("Seguidores:");

        label_imagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_nome_usuario.setText("Username:");

        text_username.setEditable(false);

        label_repos_publicos.setText("Repositórios públicos:");

        text_repos_publicos.setEditable(false);

        label_pesquisa.setText("Digite seu username do GitHub:");

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        btn_Voltar.setText("< Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_repos_publicos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_data_criacao)
                                .addComponent(label_biografia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_email, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_biografia, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(text_repos_publicos)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(text_pesquisa)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(label_pesquisa)
                                    .addGap(104, 104, 104)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_pesquisar)
                                .addGap(149, 149, 149)))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_comapania)
                            .addComponent(label_seguidores)
                            .addComponent(label_nome_usuario)
                            .addComponent(label_nome))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_username)
                            .addComponent(text_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_data_criacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_compania, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_seguidores)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Voltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_pesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_pesquisar)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nome_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_data_criacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_data_criacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_compania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_comapania))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_seguidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_seguidores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_repos_publicos)
                    .addComponent(text_repos_publicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_biografia)
                    .addComponent(text_biografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        try {
            if(text_pesquisa.getText().isBlank())
                return;
            
            String perfil_de_busca = text_pesquisa.getText();
            
            HttpURLConnection requisicao = ReceberStatusPerfil(perfil_de_busca);
            StringBuilder content = ReceberRespostaJSON(requisicao);
            JSONObject json_response = new JSONObject(content.toString());
            AdicionarValoresJsonAosCampos(json_response);
            
            requisicao.disconnect();
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(PaginaCadastroPerfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PaginaCadastroPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        paginaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void AdicionarValoresJsonAosCampos(JSONObject json_response) throws IOException{
        String avatar_url = json_response.get("avatar_url").toString();
        String username = json_response.get("login").toString();
        String nome = json_response.get("name").toString();
        String data_criacao = json_response.get("created_at").toString();
        String email = json_response.get("email").toString();
        String biografia = json_response.get("bio").toString();
        String compania = json_response.get("company").toString();
        String seguidores = json_response.get("followers").toString();
        String repos_publicos = json_response.get("public_repos").toString();

        RenderizarAvatarPerfil(avatar_url);
        text_username.setText(username);
        text_nome.setText(nome);
        text_email.setText(email);
        text_data_criacao.setText(data_criacao);
        text_compania.setText(compania);
        text_seguidores.setText(seguidores);
        text_repos_publicos.setText(repos_publicos);
        text_biografia.setText(biografia);
    }

    private void RenderizarAvatarPerfil(String avatar_url) throws IOException {
        BufferedImage avatar_image = ImageIO.read(new URL(avatar_url));
        Image imagem_resized = new ImageIcon(avatar_image).getImage().getScaledInstance(label_imagem.getWidth(), label_imagem.getHeight(), Image.SCALE_SMOOTH);
        label_imagem.setIcon(new ImageIcon(imagem_resized));
    }
    
    private StringBuilder ReceberRespostaJSON(HttpURLConnection requisicao) throws IOException {
        StringBuilder content;
        try (BufferedReader leitor_retorno = new BufferedReader(new InputStreamReader(requisicao.getInputStream()))) {
            String inputLine;
            content = new StringBuilder();
            while ((inputLine = leitor_retorno.readLine()) != null) {
                content.append(inputLine);
            }
        }
        return content;
    }

    private HttpURLConnection ReceberStatusPerfil(String perfil_de_busca) throws MalformedURLException, IOException {
        URL git_url = new URL("https://api.github.com/users/"+perfil_de_busca);
        HttpURLConnection http = (HttpURLConnection)git_url.openConnection();
        http.setRequestProperty("Accept", "application/json");      
        return http;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_biografia;
    private javax.swing.JLabel label_comapania;
    private javax.swing.JLabel label_data_criacao;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_imagem;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_nome_usuario;
    private javax.swing.JLabel label_pesquisa;
    private javax.swing.JLabel label_repos_publicos;
    private javax.swing.JLabel label_seguidores;
    private javax.swing.JTextField text_biografia;
    private javax.swing.JTextField text_compania;
    private javax.swing.JTextField text_data_criacao;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_nome;
    private javax.swing.JTextField text_pesquisa;
    private javax.swing.JTextField text_repos_publicos;
    private javax.swing.JTextField text_seguidores;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}
