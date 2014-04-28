# -*- coding: iso-8859-1 -*-
#
# Copyright (C) 2009  Rene Liebscher
#
# This program is free software; you can redistribute it and/or modify it under
# the terms of the GNU Lesser General Public License as published by the Free 
# Software Foundation; either version 3 of the License, or (at your option) any
# later version.
#
# This program is distributed in the hope that it will be useful, but WITHOUT 
# ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
# FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
# 
# You should have received a copy of the GNU Lesser General Public License along with 
# this program; if not, see <http://www.gnu.org/licenses/>. 
#

__revision__ = "$Id: DualOfHarmonicMean.py,v 1.4 2009/08/07 07:19:19 rliebscher Exp $"

from fuzzy.norm.Norm import Norm,product,sum

class DualOfHarmonicMean(Norm):

    def __init__(self):
        Norm.__init__(self,0) #XXX

    def __call__(self,*args):
        sum_ = sum(*args)
        if sum_ == len(args): return 1.0
        product_ = product(*args)
        count_ = float(len(args))
        return (sum_-count_*product_)/(count_-sum_) 
