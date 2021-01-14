module InRange (
    inRange
) where

inRange :: Ord a => a -> a -> a -> Bool
inRange min max x =
    x >= min && x <= max