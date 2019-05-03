import kotlinx.coroutines.*

    var ThousArray = IntArray(10000)

    fun main(args: Array<String>) = runBlocking {
        val CoroutineArray1 = arrayOfNulls<Job>(10000)
        val StartTime1 = System.nanoTime()
        for (i in 0..9999) {
            CoroutineArray1[i] = GlobalScope.launch {
                ThousArray[i] = 1
                println("1")
            }
        }

        for (i in 0..9999) {
            try {
                CoroutineArray1[i]?.join()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }
        val FinishTime1 = System.nanoTime()
        val Duration1 = FinishTime1 - StartTime1
        println("Time Elapsed: $Duration1")

        val CoroutineArray2 = arrayOfNulls<Job>(10000)
        val StartTime2 = System.nanoTime()
        for (i in 0..9999) {
            CoroutineArray2[i] = GlobalScope.launch {
                ThousArray[i] = 1
                println("1")
            }
        }

        for (i in 0..9999) {
            try {
                CoroutineArray2[i]?.join()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }
        val FinishTime2 = System.nanoTime()
        val Duration2 = FinishTime2 - StartTime2
        println("Time Elapsed: $Duration2")

        val CoroutineArray3 = arrayOfNulls<Job>(10000)
        val StartTime3 = System.nanoTime()
        for (i in 0..9999) {
            CoroutineArray3[i] = GlobalScope.launch {
                ThousArray[i] = 1
                println("1")
            }
        }

        for (i in 0..9999) {
            try {
                CoroutineArray3[i]?.join()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }
        val FinishTime3 = System.nanoTime()
        val Duration3 = FinishTime3 - StartTime3
        println("Time Elapsed: $Duration3")


        val CoroutineArray4 = arrayOfNulls<Job>(10000)
        val StartTime4 = System.nanoTime()
        for (i in 0..9999) {
            CoroutineArray4[i] = GlobalScope.launch {
                ThousArray[i] = 1
                println("1")
            }
        }

        for (i in 0..9999) {
            try {
                CoroutineArray4[i]?.join()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }
        val FinishTime4 = System.nanoTime()
        val Duration4 = FinishTime4 - StartTime4
        println("Time Elapsed: $Duration4")


        val CoroutineArray5 = arrayOfNulls<Job>(10000)
        val StartTime5 = System.nanoTime()
        for (i in 0..9999) {
            CoroutineArray5[i] = GlobalScope.launch {
                ThousArray[i] = 1
                println("1")
            }
        }

        for (i in 0..9999) {
            try {
                CoroutineArray5[i]?.join()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }
        val FinishTime5 = System.nanoTime()
        val Duration5 = FinishTime5 - StartTime5
        println("Time Elapsed: $Duration5")

        val Avg = ((Duration1 + Duration2 + Duration3 + Duration4 + Duration5)/5)
        println("Average Time: $Avg")

    }