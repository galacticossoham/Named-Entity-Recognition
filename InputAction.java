/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class InputAction extends javax.swing.JFrame {
   String str,s="",ca="",kkg="",kkgg="",a="",bab="",ccac="",b="",as="",ass="",c="",uuu="",d="",e="",cac="",nnn="",f="",g="",h="",i="",cc="",ww="";
   int j=0,k=0,l=0,m=0,n=0,rrr=0,o=0,p=0,kkr=1,q=0,r=0,rr=0,qq=0,hhh=1,xxx=1,iii=0;
    /**
     * Creates new form InputAction
     */
    public InputAction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        ctext = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ptext = new javax.swing.JTextArea();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(79, 24, 253));
        setForeground(new java.awt.Color(64, 38, 244));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("GET THE NOUNS ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane1.setViewportView(TextArea1);

        label1.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        label1.setText("Enter your Text in the Text Area below !!");

        ctext.setColumns(20);
        ctext.setRows(5);
        jScrollPane2.setViewportView(ctext);

        ptext.setColumns(20);
        ptext.setRows(5);
        jScrollPane3.setViewportView(ptext);

        label.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        label.setText("The Common Nouns :");

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel1.setText("The Proper Nouns :");

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton2)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
        TextArea1.write(bw);
        bw.close();
        
        InputAction ia= new InputAction();
        ia.runbatch();
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));
  
            while((str = in.readLine())!=null)
            {
                StringTokenizer st = new StringTokenizer(str,")");
                while(st.hasMoreTokens())
                {
                    
                    s=st.nextToken();
                 System.out.println("The TOKEN :"+s);
                    if((s.startsWith(" (NN ")))
                    {
                        j=s.length();
                        a=s.substring(5,j);
                        System.out.println("The common noun : "+a);
                        if((xxx>0)&&(xxx<2)){
                            bab=a;
                            xxx=0; 
                        }
                       else if(xxx<1){
                            as=a;
                           xxx=2;
                       }
                       else if(xxx>1)
                       {
                           ass=a;
                       }
                        
                    }
                    else if(s.startsWith("          (NP (NN "))
                    {
                        iii=s.length();
                        nnn=s.substring(18,iii);
                        System.out.println("The common noun : "+nnn);
                        
                    }
                    else if(s.startsWith(" (NP (NNP "))
                    {
                        m=s.length();
                        d=s.substring(10,m);
                        System.out.println("The proper noun : "+d);
                        
                    }
                    else if(s.startsWith("      (NP (NNP "))
                    { 
                        n=s.length();
                        e=s.substring(15,n);
                        System.out.println("The proper noun : "+e);
                        
                    }
                    else if(s.startsWith("            (NP (NNP "))
                    {
                        qq=s.length();
                        ww=s.substring(21,qq);
                        System.out.println("The proper noun : "+ww);
                        
                    }
                    else if(s.startsWith("    (NP (NNP "))
                    {
                        o=s.length();
                        f=s.substring(13,o);
                        System.out.println("The proper noun : "+f);
                        
                    }
                    else if(s.startsWith("        (NP (NNP "))
                    {
                        p=s.length();
                        g=s.substring(17,p);
                        System.out.println("The proper noun : "+g);
                        if(kkr>0)
                        {
                            kkg=g;
                            kkr=0;
                        }
                        else if(kkr<1){
                            kkgg=g;kkr=1;
                        }
                        
                    }
                    else if(s.startsWith("          (NP (NNP "))
                    {
                        k=s.length();
                        b=s.substring(19,k);
                        System.out.println("The proper noun : "+b);
                        
                    }
                    else if(s.startsWith(" (NNP "))
                    {
                        l=s.length();
                        c=s.substring(6,l);
                        System.out.println("The proper noun : "+c);
                        if(hhh>0)
                        {
                        cac=c;
                            hhh=0;
                        }
                        else if(hhh<1)
                        {
                             ca=c;
                             hhh=3;
                        }
                        else if (hhh>2 && hhh<4)
                        {
                            ccac=c;
                            hhh=1;
                        }
                    }
                    else if(s.startsWith("              (NP (NNP "))
                    {
                        rr=s.length();
                        cc=s.substring(23,rr);
                        System.out.println("The proper noun : "+cc);
                        
                    }
                    else if(s.startsWith(" (NNS "))
                    {
                        q=s.length();
                        h=s.substring(6,q);
                        System.out.println("The common noun : "+h);
                        
                    }
                    else if(s.startsWith("                  (NP (NNS "))
                    {
                        r=s.length();
                        i=s.substring(27,r);
                        System.out.println("The common noun : "+i);
                        
                    }
                    else if(s.startsWith("            (NP (NN "))
                    {
                        rrr=s.length();
                        uuu=s.substring(20,rrr);
                    }
                    ctext.setText(bab+"  "+as+"  "+ass+"  "+nnn+"  "+h+"  "+i+"  "+uuu);
                    ptext.setText(d+"  "+e+"  "+ww+"  "+f+"  "+kkg+"  "+b+"  "+cac+"  "+ca+"  "+cc+" "+kkgg);
       
                }
       
            }
        
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
       
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
ctext.setText("");
ptext.setText("");
TextArea1.setText("");
s="";ca="";a="";bab="";ccac="";b="";as="";ass="";c="";uuu="";d="";e="";cac="";nnn="";f="";g="";h="";i="";cc="";ww="";
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        

        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputAction().setVisible(true);
                
            }
        });
    }
    public void runbatch()
    {
        try
        {
            String cmds[] = {"lexparser.bat"};
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(cmds);
            process.getOutputStream().close();
            InputStream inputStream = process.getInputStream();
            InputStreamReader inputstreamreader = new InputStreamReader(inputStream);
            BufferedReader bufferedrReader = new BufferedReader(inputstreamreader);
            String strLine = "";
            while ((strLine = bufferedrReader.readLine()) != null)
            {
                System.out.println(strLine);
            }
        } 
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextArea ctext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label;
    private java.awt.Label label1;
    private javax.swing.JTextArea ptext;
    // End of variables declaration//GEN-END:variables
}
