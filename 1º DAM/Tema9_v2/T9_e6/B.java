package T9_e6;

public class B {
    
    public static void comprobar(String c) throws Exception {
        
        if (c.contains("@.")) {
            
            throw new Exception("DireccionCorreoIncorrectaException");
            
        } else if (c.contains("@")) {
        
            String [] corte1 = c.split("@", 2);
            if(corte1[1].contains(".")) {
                
                String [] corte2 = corte1[1].split("\\.", 2);
                if(corte2[1].equals("")) {
                    
                    throw new Exception("DireccionCorreoIncorrectaException");
                    
                }
                
            } else {
                
                throw new Exception("DireccionCorreoIncorrectaException");
                
            }
    
        } else {
            
            throw new Exception("DireccionCorreoIncorrectaException");
            
        }
        
    }
    
    public static void main(String [] args) throws Exception {
        
        String correo = "140359@iessierradeguara.com";
        
        comprobar(correo);
        
    }

}
