class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
       
        if(root==null){
            return a;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             ArrayList<Integer> t=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                t.add(temp.data);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
             a.add(t);
          
          }  
          return a;
         
    }
}
