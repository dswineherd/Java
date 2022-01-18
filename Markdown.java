public class Challenge {
  public static String markdownParser(String markdown) {
    markdown = markdown.strip();
    final int index = markdown.trim().indexOf(' ');
    if(index > 0){
      final String mkdown = markdown.substring(0, index);
      long count = mkdown.chars().filter(ch -> ch == '#').count();
      if(mkdown.length() != count || count > 6){
          System.out.println("Invalid Markdown chars found");
          return markdown;}

       String header = new StringBuilder().append("h").append(count).append(">").toString();
       return new StringBuilder().append("
       <").append(header).append(markdown.substring(index+1).trim()).append("
       </").append(header).toString();}

return markdown;
