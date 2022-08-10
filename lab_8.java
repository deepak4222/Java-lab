import java.util.Scanner;
public class lab_8 {
    static int i,j,k,a,b,u,v,n,ne=1;
    static int min,mincost=0;
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int cost[][] = new int[10][10];
        int parent[] = new int[10];
        System.out.println("Implementation of Kruskal's algorithm");
        System.out.println ("Enter the no. of vertices");
        n=sobj.nextInt();
        for(i=1;i<=n;i++)
            parent[i]=0;
        System.out.println("\nEnter the cost adjacency matrix\n");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=sobj.nextInt();
                if(cost[i][j]==0)
                    cost[i][j]=999;
            }
        }
        System.out.println("The edges of Minimum Cost Spanning Tree are");
        while(ne<n)
        {
            min=999;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(cost[i][j]<min)
                    {
                        min=cost[i][j];
                        a=u=i;
                        b=v=j;
                    }
                }
            }
            u=find(u,parent);
            v=find(v,parent);
            if (uni(u,v,parent)==1)
            {
                System.out.println("edge("+a+","+b+")=" +min);
                ne++;
                mincost +=min;
            }
            cost[a][b]=cost[b][a]=999;
        }
        System.out.println("Minimum cost = "+mincost);
    }
    public static int find(int i,int parent[])
    {
        while(parent[i]!=0)
            i=parent[i];
        return i;
    }
    public static int uni(int i,int j,int parent[])
    {
        if(i!=j)
        {
            parent[j]=i;
            return 1;
        }
        return 0;
    }
}

