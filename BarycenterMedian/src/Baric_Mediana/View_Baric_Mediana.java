package Baric_Mediana;

import java.awt.BorderLayout;

/**
 *
 * @author  adejongh
 */
public class View_Baric_Mediana extends javax.swing.JApplet {

    protected Baric_Mediana p;

    /** Initializes the applet View_Baric_Mediana */
    public void init() {
        p = new Baric_Mediana(140, 50, 30, 200, 250, 200);
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {

                public void run() {
                    initComponents();
                    setSize(720, 400);
                    p.setSize(720, 400);
                    p_contenedor.setSize(450, 400);
                    p_contenedor.setLayout(new BorderLayout(10, 5));
                    p_contenedor.add(p, BorderLayout.CENTER);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_contenedor = new javax.swing.JPanel();

        javax.swing.GroupLayout p_contenedorLayout = new javax.swing.GroupLayout(p_contenedor);
        p_contenedor.setLayout(p_contenedorLayout);
        p_contenedorLayout.setHorizontalGroup(
            p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        p_contenedorLayout.setVerticalGroup(
            p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel p_contenedor;
    // End of variables declaration//GEN-END:variables
}
