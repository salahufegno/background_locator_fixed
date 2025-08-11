package yukams.app.background_locator_2.provider

import kotlin.collections.HashMap

interface LocationUpdateListener {
    fun onLocationUpdated(location: HashMap<String, Any>?)
}