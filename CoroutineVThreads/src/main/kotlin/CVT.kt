import kotlinx.coroutines.*

internal class CVT {

    var ThousArray = IntArray(10000)

    fun main(args: Array<String>) = runBlocking {
        val CoroutineArray = arrayOfNulls<Job>(10000)
        val StartTime = System.nanoTime()
        for (i in 0..9999) {
            CoroutineArray[i] = GlobalScope.launch {
                ThousArray[i] = 1
                print("1")
            }
        }

        for (i in 0..9999) {
            try {
                CoroutineArray[i]?.join()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }

        val FinishTime = System.nanoTime()
        val Duration = FinishTime - StartTime
        println("Time Elapsed: $Duration")
    }

}