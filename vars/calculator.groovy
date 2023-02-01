def add(x,y){
  sh """
  sum=`expr ${x} + ${y}`
  echo "sum of ${x} and ${y} is ${sum}"
  """
}
