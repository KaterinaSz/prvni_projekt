//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// zdrojový kód
public class Main {
    public static void main(String[] args) {
        //popis metody, která následuje

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Ahoj světe, jak se všichni máte?"); //naše poznámky
        /*
        více řádkový komentář
        můžu si psát i tady a nikdo si toho nevšímá (můžu i uprostřed řádku)
         */
        System.out.println("To je fajn, že jste tady!");
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.print("i = " + i);
            if (i<5){
                System.out.println(", ");
            //println - print lajn, zalomení řádku
        /*breakpoint - červený puntík - do červeného puntíku jede a louská kód, pak se zastaví
        a můžu řešit bugy puntíku
             brouček/beruška nahoře
        */
            }

        }
    }
}