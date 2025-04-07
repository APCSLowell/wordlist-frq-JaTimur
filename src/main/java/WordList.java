import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int num=0;
    for(int n=0;n<myList.size();n++){
      if(myList.get(n).length()==len) num++;
    }
    return num;
  }

  public void removeWordsOfLength(int len)
  {
    for(int n=0;n<myList.size();n++){
      if(myList.get(n).length()==len){
        myList.remove(n);
        n--;
      }
    }
  }
}
