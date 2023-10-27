import java.util.*;
public class we {
static class Edge
{
int src;
int dest;

public Edge(int s,int d)
{
this.src=s;
this.dest=d;
}

}

public static void bfs(ArrayList<Edge> graph[],int m)
{
  Queue<Integer> q=new LinkedList<>();
  boolean vis[]=new boolean[m];
  q.add(0);
  for(int i=0;i<m;i++)
  {

    vis[i]=false;
  }
  while(!q.isEmpty())
  {
    int curr=q.remove();
    if(vis[curr]==false)
    {
      System.out.print(curr+" ");
      vis[curr]=true;

      for(int i=0;i<graph[curr].size();i++)
      {
        Edge e=graph[curr].get(i);
        q.add(e.dest);
      }
    }
  }
}
public static void main(String[]args) throws Exception
{
    int k=0;
    int c=0;
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    ArrayList<Edge> graph[]=new ArrayList[m];
    int a,b,ji=0;
    for(int i=0;i<graph.length;i++)
    {
        graph[i]=new ArrayList<Edge>();
    }
    while(ji<n)
    {
        a=sc.nextInt();
        b=sc.nextInt();
        graph[a].add(new Edge(a,b));
        ji++;
    }
    for(int j=0;j<graph.length;j++)
    {
    for(int i=0;i<graph[j].size();i++)
    {
      Edge e=graph[j].get(i);
      c++;
    }
    if(c>1)
    {
        k++;
    }
    c=0;
    }
    System.out.println(k);
    bfs(graph,m);
    System.out.println();
    sc.close();
}
}
