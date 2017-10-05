object Lab {
//*****Task 1 & 2*****
	def lastNth(n:Int , l:List[Int]) = {
		def func(iteration:Int , index: Int, subList: List[Int]): Int = {
			if (iteration == index) subList.head
			else func(iteration+1, index, subList.tail)
		}
		val len:Int = l.length
		if(n>len) 0
		else func(0,len-n,l)
	}                                         //> lastNth: (n: Int, l: List[Int])Int
	lastNth (4,List(1,1,2,2,3,3,5,5,8,9,10))  //> res0: Int = 5
	
	
	//*****Task 03*****
	def abs(x:Int) = if(x<0) -x else x        //> abs: (x: Int)Int
	def isPrime(num: Int): Boolean = {
		if(num==0 || num==1) false
		def loop(iter:Int):Boolean ={
			if(iter == abs(num)) return true
			if(iter!= 1 && num%iter == 0) return false
			else loop(iter+1)
		}
		loop(2)
	}                                         //> isPrime: (num: Int)Boolean
	isPrime(162)                              //> res1: Boolean = false
	
	
	//*****Task 04*****
	def GCD(i1: Int, i2: Int): Int = if(i2 == 0) i1 else GCD(i2, i1%i2)
                                                  //> GCD: (i1: Int, i2: Int)Int
  def isCoPrime(a: Int, b:Int) = if(GCD(a,b)==1) println("Numbers are Co-Prime") else println("Numbers are not Co-Prime")
                                                  //> isCoPrime: (a: Int, b: Int)Unit
	isCoPrime(7,8)                            //> Numbers are Co-Prime
	
	
	//*****Task 05*****
	def XOR(i1: Boolean, i2:Boolean) = i1 != i2
                                                  //> XOR: (i1: Boolean, i2: Boolean)Boolean
	
	XOR(true,true)                            //> res2: Boolean = false
	
	
		//*****Task 06*****
		def AND(i1: Boolean, i2:Boolean) = if(i1) i2 else false
                                                  //> AND: (i1: Boolean, i2: Boolean)Boolean
		
		AND(true,false)                   //> res3: Boolean = false
		
		
		//*****Task 07*****
		def NAND(i1: Boolean, i2:Boolean) = if(i1) !i2 else true
                                                  //> NAND: (i1: Boolean, i2: Boolean)Boolean
    
    NAND(true,false)                              //> res4: Boolean = true
}