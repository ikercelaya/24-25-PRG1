package entregas.celayaIker.src;

class Caracol {
    
    public static void main(String[] args) {
        
        final int PROFUNDIDAD = 20;

        final String POZO_TOPE = "[__]              [__]";
        final String POZO_PARED = "  []:. :. :. :. :.[] _ __";
        final String POZO_BASE = "  [][][][][][][][][]";
        final String POZO_AGUA = "  []~~~~~~~~~~~~~~[] _ __";
        final String POZO_CARACOL = "  []    _@)_/’    [] _ __";

        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random()*20-10+1)+10;
        int dia = 0;

        do {
            System.out.println("DIA "+dia);
            System.out.println(POZO_TOPE);
            for(int i = 0; i <= PROFUNDIDAD; i++) {
                if(profundidadCaracol == i) {
                System.out.println(POZO_CARACOL + i);
                } else if(i > PROFUNDIDAD - profundidadAgua) {
                System.out.println(POZO_AGUA + i);
                } else {
                System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE);
            profundidadCaracol--;
            dia++;
        } while(profundidadCaracol>0);
    }
}