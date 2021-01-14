module Main where

import qualified Lib ( someFunc ) 
import qualified InRange ( inRange )

main :: IO ()
main = do
    someFunc
    inRange 0 5 3
