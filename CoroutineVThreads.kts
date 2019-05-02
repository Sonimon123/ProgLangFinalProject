import kotlinx.coroutines.*

internal class CoroutineVThreads {

    var ThousArray = IntArray(10000)

    internal inner class ArrWrite(// Writes to array

            var i: Int) : Runnable {

        override fun run() {
            ThousArray[i] = 1
            println("1")
        }

    }

    fun main(args: Array<String>) {
        val CoroutineArray = arrayOfNulls<Thread>(10000)
        val StartTime = System.nanoTime()
        for (i in 0..9999) {
            CoroutineArray[i] = GlobalScope.launch {
                ArrWrite.run()
            }
        }

        for (i in 0..9999) {
            try {
                CoroutineArray[i].join()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }

        val FinishTime = System.nanoTime()
        val Duration = FinishTime - StartTime
        println("Time Elapsed: $Duration")
    }

}