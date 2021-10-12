
//解构数组
let input = [89, 64, 2018, 10];
let [first, second] = input;//注意使用[]
console.log(first); // 89
console.log(second); // 64
let [one, ...others] = input; //剩余变量
console.log(...others);
//展开
let newArr = [89, ...others, 18];
console.log(newArr);
//解构对象
let o = {
  a: "foo",
  b: 12,
  c: "bar"
};
let {a, b} = o;//注意使用{}，且变量名需与对象中道属性名一致
console.log(a, b);