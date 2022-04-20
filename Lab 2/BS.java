  public void printMinAndMaxValuesByBS(int arr[]) { 
 
        int sizeOfArr = arr.length; 
        int min = sizeOfArr, max = arr[sizeOfArr - 1]; 
 
        for (int element = 0; element < (sizeOfArr - 1); element++) { 
            min = element; 
            for (int i = (element + 1); i < sizeOfArr; i++) { 
                if (arr[min] > arr[i]) { 
                    min = i; 
                } 
            } 
 
            // do swapping 
            int temp = arr[element]; 
            arr[element] = arr[min]; 
            arr[min] = temp; 
        } 
 
        long startTime = System.nanoTime(); 
        min = arr[0]; 
        max = arr[sizeOfArr - 1]; 
        System.out.println("\n[+] Min value = " + min + ", Max value =" + max); 
        long endTime = System.nanoTime(); 
        System.out.println("\t=>Time of executing code by Binary Search without sorting  = " + (endTime - startTime) 
                + " nanoSeconds"); 
    } 
 
}