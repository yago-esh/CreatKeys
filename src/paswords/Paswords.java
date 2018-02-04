package paswords;

public class Paswords {

    String pasword;
    int longitud;
    boolean mayusculas;
    String clave;
    int numchar;

    public Paswords(String pasword, String clave, int numchar, boolean mayusculas) {
        this.pasword = pasword;
        this.clave = clave;
        this.mayusculas=mayusculas;
        longitud = this.pasword.length();
        this.numchar=numchar;
    }

    public char[] almacenar() {
        char[] caracteres = new char[numchar];
        if (numchar<longitud) longitud=numchar;
        int i;
        for (i=0; i < longitud; i++) {
            caracteres[i] = (char) pasword.charAt(i);
        }
        if (i<numchar){
            int p=0;
            while(i<numchar-1){
                i++;
                caracteres[i] = caracteres[p];
            }
        }
        return caracteres;

    }

    public char[] almacenar(String cadena) {
        char[] caracteres = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            caracteres[i] = (char) cadena.charAt(i);
        }
        return caracteres;

    }

    public int[] convertir(char[] cadena, int clave) {
        int[] cadnum = new int[numchar];
        for (int x = 0; x < numchar; x++) {
            cadnum[x] = this.funcion((int) cadena[x], x, clave);
        }
        return cadnum;
    }

    public int funcion(int num, int valor, int clave) {
        num = ((num+valor)*clave)*numchar^(2/3);
        num = num % 122;
        if (mayusculas) {
            if (num < 48) {
                num = 48 + num % 10;
            }
            if (num < 65 && num > 57) {
                num += 7;
            }
            if (num < 97 && num > 90) {
                num += 7;
            }
        } else {
            if (num < 25) {
                if(num<9)num++;
                if(num<18)num++;
                num = 97 + num;
            }
            if (num >25 && num<48){
                int x=0;
                if(num%10==6) x=1;
                if(num%10==7) x=2;               
                num = 48 + num%10 + x;
            }
            if (num < 97 && num > 57) {
                num += 40;
            }
            if (num > 122) {
                num = this.funcion(num%122, valor, clave);
            }
        }
        return num;
    }

    public char[] desconvertir(int[] cadena) {
        char[] cadenita = new char[numchar];
        for (int x = 0; x < numchar; x++) {
            cadenita[x]=((char) cadena[x]);
        }
        return cadenita;
    }

    public void mayusculas() {
        GestorIO gestorIO = GestorIO.getGestorIO();
        boolean correcto = false;
        do {
            char mayus = gestorIO.leerChar("Do you want to use capital letters in your new password? [y]/[n]: ");
            
            if (mayus == 'y') {
                mayusculas = true;
                correcto = true;
            } else if (mayus == 'n') {
                mayusculas = false;
                correcto = true;
            } else {
                gestorIO.escribir("Answer the question correctly.");
            }
        } while (!correcto);

    }

    public int crearClave() {
        GestorIO gestorIO = GestorIO.getGestorIO();
        int num = 0;
        char[] cadena = this.almacenar(clave);
        for (int x = 0; x < clave.length(); x++) {
            num += num + (int) cadena[x];
        }

        return num;
    }

    public boolean salir() {
        GestorIO gestorIO = GestorIO.getGestorIO();
        char mayus = gestorIO.leerChar("Do you want to exit? [y]/[n]: ");

        if (mayus == 'y') {
            return true;
        } else if (mayus == 'n') {
            return false;
        } else {
            gestorIO.escribir("Answer the question correctly.");
        }
        return false;
    }

    public int cuantoschar() {
        GestorIO gestorIO = GestorIO.getGestorIO();
        boolean correcto = false;
        do {
            int numcharr = gestorIO.leerInt("How many characters do you want in your new password?: ");
            if (numcharr > 0) {
                return numcharr;
            }
            else gestorIO.escribir("Answer the question correctly.");
        } while (!correcto);
        return 0;
    }
    
    public char[] inicializar(Paswords Pass){
            int valorf = Pass.crearClave();
            char[] cadena = Pass.almacenar();
            int[] cadnum = Pass.convertir(cadena, valorf);
            return Pass.desconvertir(cadnum);
    }

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
            java.util.logging.Logger.getLogger(VPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPassword().setVisible(true);
            }
        });   
    }

}
