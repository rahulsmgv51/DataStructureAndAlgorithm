package Opps.WrapperClasses;

public class CLI {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
            System.out.println("OP "+args[i]);
        }
    }
}
// This is called command line argumnet input passing in java
// Output of above program
// 'C:\Program Files\Java\jdk-20\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\NikolaTesla\AppData\Roaming\Code\User\workspaceStorage\3ff27dd54c2a12cb3e1aef268db5815e\redhat.java\jdt_ws\DSA_5258371f\bin' 'Opps.WrapperClasses.CLI' hello my name is rahul
// OP hello
// OP my
// OP name
// OP is
// OP rahul