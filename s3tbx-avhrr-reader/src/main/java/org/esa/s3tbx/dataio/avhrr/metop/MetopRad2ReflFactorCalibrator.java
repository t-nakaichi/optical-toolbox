/*
 * Copyright (C) 2010 Brockmann Consult GmbH (info@brockmann-consult.de)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */
package org.esa.s3tbx.dataio.avhrr.metop;


import org.esa.s3tbx.dataio.avhrr.calibration.RadianceCalibrator;

public class MetopRad2ReflFactorCalibrator implements RadianceCalibrator {

	private float conversionFactor;

	public MetopRad2ReflFactorCalibrator(double solarIrradiance, double earthSunDistance) {
		conversionFactor = (float) (solarIrradiance / (100.0 * Math.PI * earthSunDistance * earthSunDistance));
	}

	@Override
    public float calibrate(float radiances) {
		return radiances / conversionFactor;
	}
	
	public float getConversionFactor() {
		return conversionFactor;
	}
}