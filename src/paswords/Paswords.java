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

    public int crearClave() {
        int num = 0;
        char[] cadena = this.almacenar(clave);
        for (int x = 0; x < clave.length(); x++) {
            num += num + (int) cadena[x];
        }
        return num;
    }
    
    public char[] inicializar(Paswords Pass){
            int valorf = Pass.crearClave();
            char[] cadena = Pass.almacenar();
            int[] cadnum = Pass.convertir(cadena, valorf);
            return Pass.desconvertir(cadnum);
    }
}
