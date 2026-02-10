package stepkin.les24;

public class Roles {

   static void sortTestBook(String[] roles, String[] text){
      StringBuilder result = new StringBuilder();

      for (int i = 0; i <= roles.length - 1; i++){
         result.append(roles[i] + ":" + '\n');

         for (int j = 0; j<= text.length - 1; j++){

            if (text[j].startsWith(roles[i] + ":")) {
               char a = ':';
               result.append((j+1)+ ")" + text[j].substring(text[j].indexOf(a)+1)+'\n');
               }

            }
         result.append('\n');
         }

      System.out.println(result.toString());
   }

   public static void main(String[] args) {

      String [] roles= {
              "Городничий","Аммос Федорович",
              "Артемий Филиппович",
              "Лука Лукич"};
      String [] textLines={
              "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
              "Аммос Федорович: Как ревизор?",
              "Артемий Филиппович: Как ревизор?",
              "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
              "Аммос Федорович: Вот те на!",
              "Артемий Филиппович: Вот не было заботы, так подай!",
              "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

      sortTestBook(roles,textLines);
   }
}
