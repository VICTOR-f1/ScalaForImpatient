package MyPackeges {
    object Random {
      private var previous: Long = 0

      def setSeed(seed: Int): Unit = {
        previous = seed.toLong
      }

      def nextInt(): Int = {
        next().toInt
      }

      def nextDouble(): Double = {
        next() / (1L << 32).toDouble
      }

      private def next(): Long = {
        previous = (previous * 1664525 + 1013904223) % (1L << 32)
        previous
      }
    }
  }
