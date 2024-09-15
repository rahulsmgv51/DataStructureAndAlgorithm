package Exception.ExceptionHandling_Example;

public class MainClass {
    public static void main(String[] args) {
        int a[] = new int[6];
        System.out.println("Try to handle Exception");

        try {
            int res = 5/0;
            System.out.println(a[8]);
        /* } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access the out of bound element");
        }
        catch(ArithmeticException e){
            //Provides programmatic access to the stack trace information printed by printStackTrace().
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.getCause());
        } 
        catch(Exception e){
            System.out.println(e);
        }    
        */
       } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            System.out.println(e);
       }
        
    }
}