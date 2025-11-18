class su {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i=2; i<=n; i+=2)
            sum += i;
        System.out.println("Sum = " + sum);
    }
}
