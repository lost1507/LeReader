/*
 * Copyright (C) 2010-2013 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.zlibrary.core.network;

import java.util.List;
import java.util.Date;

import org.apache.http.cookie.Cookie;

public abstract class CookieDatabase {
	private static CookieDatabase ourInstance;

	public static CookieDatabase getInstance() {
		return ourInstance;
	}

	protected CookieDatabase() {
		ourInstance = this;
	}

	protected abstract void removeObsolete(Date date);
	protected abstract void removeAll();
	protected abstract void saveCookies(List<Cookie> cookies);
	protected abstract List<Cookie> loadCookies();
}