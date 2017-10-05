object Task8 {
 	def generateResult(X: Int,a: Int,b: Int,c: Int,d: Int,e: Int) = {
 	
 		def func(L1: List[Int], str: String , result: Int): Unit={
 			if(L1.length == 0 && result == X) println(str.concat("=").concat(result.toString))
 			for(element<-L1){
	 			func(L1.filter(_!=element), str.concat("+").concat(element.toString),result+element)
	 			func(L1.filter(_!=element), str.concat("-").concat(element.toString),result-element)
	 			func(L1.filter(_!=element), str.concat("*").concat(element.toString),result*element)
	 			func(L1.filter(_!=element), str.concat("/").concat(element.toString),result/element)
 			}
 		}
 		func(List(a,b,c,d,e), "" ,0)
 	}                                         //> generateResult: (X: Int, a: Int, b: Int, c: Int, d: Int, e: Int)Unit
 	generateResult(36,1,2,3,4,5)              //> +1+2+4+5*3=36
                                                  //| +1+2+5+4*3=36
                                                  //| +1+3*2*5-4=36
                                                  //| +1+3*5*2-4=36
                                                  //| +1+4+2+5*3=36
                                                  //| +1+4+5+2*3=36
                                                  //| +1+4*5/2*3=36
                                                  //| +1+5+2+4*3=36
                                                  //| +1+5*2-3*4=36
                                                  //| +1+5/2*3*4=36
                                                  //| +1+5/2*4*3=36
                                                  //| +1+5*3/2*4=36
                                                  //| +1+5*3*4/2=36
                                                  //| +1+5+4+2*3=36
                                                  //| +1+5*4/2*3=36
                                                  //| +1+5*4*3/2=36
                                                  //| +1*5-2*3*4=36
                                                  //| +1*5-2*4*3=36
                                                  //| -1+2+3+5*4=36
                                                  //| -1+2+5+3*4=36
                                                  //| -1*2+5*3*4=36
                                                  //| -1*2+5*4*3=36
                                                  //| -1+3+2+5*4=36
                                                  //| -1+3*2+5*4=36
                                                  //| -1+3+5+2*4=36
                                                  //| -1+4*5+3*2=36
                                                  //| -1+5+2+3*4=36
                                                  //| -1+5*2+4*3=36
                                                  //| -1+5+3+2*4=36
                                                  //| *1-2+5*3*4=36
                                                  //| *1-2+5*4*3=36
                                                  //| *1+5-2*3*4=36
                                                  //| *1+5-2*4*3=36
                                                  //| /1-2+5*3*4=36
                                                  //| /1-2+5*4*3=36
                                                  //| /1+5-2*3*4=36
                                                  //| /1+5-2*4*3=36
                                                  //| +2+1+4+5*3=36
                                                  //| +2+1+5+4*3=36
                                                  //| +2-1+3+5*4=36
                                                  //| +2-1+5+3*4=36
                                                  //| +2+3-1+5*4=36
                                                  //| +2+3+5-1*4=36
                                                  //| +2+4+1+5*3=36
                                                  //| +2+4+5+1*3=36
                                                  //| +2*4-1+5*3=36
                                                  //| +2*4+5-1*3=36
                                                  //| +2*4*5-1-3=36
                                                  //| +2*4*5-3-1=36
                                                  //| +2+5+1+4*3=36
                                                  //| +2+5-1+3*4=36
                                                  //| +2+5+3-1*4=36
                                                  //| +2+5+4+1
                                                  //| Output exceeds cutoff limit.
}