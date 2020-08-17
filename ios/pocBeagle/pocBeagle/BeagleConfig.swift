//
//  BeagleConfig.swift
//  pocBeagle
//
//  Created by William Denardi on 17/08/20.
//  Copyright © 2020 William Denardi. All rights reserved.
//

import Beagle
import Foundation

class BeagleConfig {
    static func config() {
        
        let dependencies = BeagleDependencies()
        dependencies.urlBuilder = UrlBuilder(
            baseUrl: URL(string: "http://localhost")
        )
        Beagle.dependencies = dependencies
    }
}
