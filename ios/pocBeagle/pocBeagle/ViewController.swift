//
//  ViewController.swift
//  pocBeagle
//
//  Created by William Denardi on 17/08/20.
//  Copyright © 2020 William Denardi. All rights reserved.
//

import UIKit
import Beagle

class ViewController: UIViewController {
      var beagleScreen: BeagleScreenViewController?
        

        
        override func viewDidLoad() {
            super.viewDidLoad()
            
            view.addSubview(beagleScreen!.view)
            
    }
    
}

