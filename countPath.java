int countPath(int m, int n, int r, int c){
	if(r==m-1 || c==n-1)
		return 1;
	return countPath(m, n, r+1,c) + countPath(m, n, r, c+1);
}		