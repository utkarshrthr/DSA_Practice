package com.utkarshrathore.app.hd.dsa._001_time_complexity;

public class _001_Number_Of_Iterations {

    static int loop1(int N){
        int count = 0;
        for(int i = 1; i <= N; i += 2){
            count++;
        }
        return count;
    }

    static void loop2(int N){
        for (int i = 0; i < N; i = i*2){
            //
        }
    }

    static int loop3(int N){
        int count = 0;
        for (int i = 1; i <= N; i = i*2){
            count++;
        }
        return count;
    }

    static int loop4(int N){
        int count = 0;
        int i = N;
        while (i > N){
            i /= 2;
            count++;
        }
        return count;
    }

    static int loop5(int N){
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++) {
                count++;
            }
        }
        return count;
    }

    static int loop6(int N){
        int count = 0;
        for(int i=1; i<=N; i++){
            for(int j=i; j<=N; j=j*2) {
                count++;
            }
        }
        return count;
    }

    static int loop7(int N){
        int count = 0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=Math.pow(2, i); j++) {
                count++;
            }
        }
        return count;
    }

    static int loop8(int N){
        int count = 0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=Math.pow(2, i); j++) {
                count++;
            }
        }
        return count;
    }

    static int loop9(int N){
        int count = 0;
        for(int i=1; i<=N; i+=2){
            for(int j=1; j<=i; j++){
                count++;
            }
        }
        return count;
    }

    static int loop10(int N){
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=N; j>i; j--){
                count++;
            }
        }
        return count;
    }

    static int loop11(int N){
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=i-1; j>=0; j++){
                count++;
            }
        }
        return count;
    }

    static int loop12(int N){
        int count = 0;
        for(int i=0; i< (1<<N); i++){
            int j = 1;
            while (j>0){
                j-=1;
                count++;
            }
        }
        return count;
    }

    static int loop13(int N){
        int count = 0;
        for(int i=1; i*i<= N; i++){
            for(int j=1; j*j<= i; j+=i){
                count++;
            }
        }
        return count;
    }

    static int loop14(int N){
        int count = 0;
        int i = 0;
        while (Math.pow(i, 2)<N){
            for(int j=0; j<= N; j++){
                for(int k=0; k<=N; k++,i++){
                    count++;
                }
            }
        }
        return count;
    }

    static int loop15(int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j=0; j < i / 2; j++){
                count++;
            }
        }
        return count;
    }

    static int loop16(int n){
        int count = 0;
        for(int i = n/2; i < n+1; i++){
            int j = 2;
            while(j<=n){
                j = j*2;
                count++;
            }
        }
        return count;
    }

    static int loop17(int N){
        int a = 0, i = N;
        int count = 0;
        while (i > 0) {
            a += i;
            i /= 2;
            count++;
        }
        return count;
    }

    static int loop18(int n){
        int count = 0;
        int i = n;
        while(i>0){
            if(i%2==0){
                for(int j=1; j<=n*n; j+=2){ // (log n)
                    count++;
                }
            }
            i = i/2;	// log n
        }
        return count;
    }

    static int loop19(int N){
        int i = 1;
        int count = 0;
        while (i<N){ // N
            int x = i;
            while (x-- > 0){ //
                count++;
            }
            i++;
        }
        return count;
    }

    static int loop20(int N){
        int count = 0;
        for(int i=N; i>0; i/=2){
            for(int j=0; j<i; j++){
                count++;
            }
        }
        return count;
    }

    static int loop21(int N){
        int count = 0;
        for(int i=0; i< N;i++){
            for(int j=N; j>i; j--){
                count++;
            }
        }
        return count;
    }

    static int loop22(int N){
        int i = 0;
        int count = 0;
        while (i*i <= N){
            for (int j = 0; j<=N; j++){
                for (int k = 0; k<=N; i++, i++){
                    count++;
                }
            }
            i++;
        }
        return count;
    }

    static int loop23(int N){
        int count = 0;
        for(int i=0; i<Math.pow(2, N); i++){
            int j = i;
            while (j > 0){
                j -= 1;
                count++;
            }
        }
        return count;
    }

    static int loop24(int N){
        int count = 0;
        for(int i=0; i*i<=N; i++){
            for(int j=0; j*j<=i; j = j+i){ // will only run 1 time because of j = j+i
                count++;
            }
        }
        return count;
    }
}
