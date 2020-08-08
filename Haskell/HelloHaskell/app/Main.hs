module Main where

import Lib
import Add
import Sub

addInt :: Int
addInt = add 2 3

subInt :: Int
subInt = sub 5 3

main = do
      helloWorld
      print addInt
      print subInt
